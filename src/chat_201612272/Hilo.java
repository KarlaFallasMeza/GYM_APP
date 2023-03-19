package chat_201612272;

import java.io.FileReader;
import java.io.IOException;


public class Hilo extends Thread{
    Window w;
    FileReader fr;
    int i=0;
    public Hilo(Window w){
        this.w=w;
    }
    @Override
    public void run(){
        while(true){
            if(w.actual!=""){
                try{
                    fr=new FileReader(w.actual);
                    w.chat.setText("");
                    if(w.N)
                        w.chat.setText(leeFichero(fr));
                    else if(w.E)
                        w.chat.setText(leeFicheroE(fr));
                    else if(w.P)
                        w.chat.setText(leeFicheroP(fr));
                }catch(IOException ex){}
            System.out.println(w.actual);
            }
            
            try{
                i++;
                w.revisarN(i);
                w.revisarE(i);
                w.revisarP(i);
                sleep(1000);
            }catch(InterruptedException ex){}
            catch(NullPointerException ex){}
        }
    }
    public static String leeFichero(FileReader fr) throws IOException{
        String a="";
        int valor=fr.read();
        while(valor!=-1){
            a+=String.valueOf((char)valor);
            valor=fr.read();
        }
        return a;
    }
    public static String leeFicheroE(FileReader fr) throws IOException{
        String a="";
        int valor=fr.read();
        while(valor!=-1){
            a+=String.valueOf((char)(valor-15));
            valor=fr.read();
        }
        return a;
    }
    public String leeFicheroP(FileReader fr) throws IOException{
        String a="";
        int valor=fr.read();
        while(valor!=-1){
            a+=String.valueOf((char)(valor));
            valor=fr.read();
        }
        a=Desencript(a);
        return a;
    }
    public String Desencript(String text){
        String a="";
        char[] r;
        r=text.toCharArray();
        for(int i=0;i<r.length;i++){
            for(int j=0;j<26;j++){
                if(r[i]==w.beta[j]){
                    a+=w.alfa[j];
                    break;
                }
                else if(j==25)
                    a+=r[i];
            }
        }
        return a;
    }
}
