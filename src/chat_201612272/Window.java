package chat_201612272;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

 
public class Window extends JFrame{
    Escucha v=new Escucha();
    Listen l=new Listen();
    JMenuBar menu;
    JMenu crear;
    JMenuItem normal;
    JMenuItem encri;
    JMenuItem priva;
    JPanel panel;
    JList lstnorm;
    DefaultListModel modnorm;
    JScrollPane scrnorm;
    JList lstencr;
    DefaultListModel modencr;
    JScrollPane screncr;
    JList lstpriv;
    DefaultListModel modpriv;
    JScrollPane scrpriv;
    JLabel lblnorm;
    JLabel lblencr;
    JLabel lblpriv;
    JButton abrirN;
    JButton abrirE;
    JButton abrirP;
    JTextArea chat;
    String temp="";
    JScrollPane scrtxt;
    JTextField write;
    JButton enter;
    Hilo hilo=new Hilo(this);
    String actual="",name;
    Boolean N=false,E=false,P=false;
    char alfa[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char beta[]=new char[26];
    String cif;
    
    public Window(){
        super("Excel Beta");
        setSize(700,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        Init();
    }
    private void Init(){
        name=JOptionPane.showInputDialog(null, "Introduzca nombre de usuario");
        hilo.start();
        menu =new JMenuBar();
        crear=new JMenu("Crear un chat");
        normal=new JMenuItem("Chat Normal");
        encri=new JMenuItem("Chat Ecriptado");
        priva=new JMenuItem("Chat Privado");
        crear.add(normal);
        crear.add(encri);
        crear.add(priva);
        normal.addActionListener(v);
        encri.addActionListener(v);
        priva.addActionListener(v);
        menu.add(crear);
        
        setJMenuBar(menu);
        panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,200,700);
        panel.setBackground(Color.WHITE);
        
        
        lstnorm=new JList();
        modnorm = new DefaultListModel();
        scrnorm =new JScrollPane();
        lstnorm.setModel(modnorm);
        scrnorm.setBounds(25,50,150,80);
        scrnorm.setViewportView(lstnorm);
        this.add(scrnorm);
        
        lstencr=new JList();
        modencr = new DefaultListModel();
        screncr =new JScrollPane();
        lstencr.setModel(modencr);
        screncr.setBounds(25,225,150,80);
        screncr.setViewportView(lstencr);
        this.add(screncr);
        
        lstpriv=new JList();
        modpriv = new DefaultListModel();
        scrpriv =new JScrollPane();
        lstpriv.setModel(modpriv);
        scrpriv.setBounds(25,400,150,80);
        scrpriv.setViewportView(lstpriv);
        this.add(scrpriv);
        
        lblnorm=new JLabel("CHAT NORMAL");
        lblnorm.setBounds(55,25,100,20);
        this.add(lblnorm);
        
        lblencr=new JLabel("CHAT ENCRIPTADO");
        lblencr.setBounds(40,200,150,20);
        this.add(lblencr);
        
        lblpriv=new JLabel("CHAT PRIVADO");
        lblpriv.setBounds(50,375,150,20);
        this.add(lblpriv);
        
        abrirN=new JButton("ABRIR NORMAL");
        abrirN.setBounds(25,130,150,20);
        abrirN.addActionListener(l);
        this.add(abrirN);
        
        abrirE=new JButton("ABRIR ENCRIPTADO");
        abrirE.setBounds(25,305,150,20);
        abrirE.addActionListener(l);
        this.add(abrirE);
        
        abrirP=new JButton("ABRIR PRIVADO");
        abrirP.setBounds(25,480,150,20);
        abrirP.addActionListener(l);
        this.add(abrirP);
        
        chat=new JTextArea(temp);
        scrtxt=new JScrollPane();
        scrtxt.setBounds(220,20,450,400);
        scrtxt.setViewportView(chat);
        //chat.setEnabled(false);
        scrtxt.setForeground(Color.BLACK);
        this.add(scrtxt);
        
        write=new JTextField();
        write.setBounds(220,450,450,20);
        this.add(write);
        
        enter=new JButton("Enviar");
        enter.setBounds(594,480,75,30);
        enter.addActionListener(l);
        this.add(enter);
        
        this.add(panel);
    }
    private String Encriptar(String bin){
        String a;
        a=BinToString(StringToBinE(bin));
        return a;
    }
    private String BinToString(String bin){
        String a="";
        StringTokenizer ST=new StringTokenizer(bin," ",false);
        while(ST.hasMoreTokens()){
            int temp=Integer.parseInt(ST.nextToken());
            a+=String.valueOf((char)temp);
        }
        return a;
    }
    private String StringToBin(String text){
        String a="";
        for(int i=0;i<text.length();i++){
            a+=(text.codePointAt(i)+15)+" ";
        }
        return a;
    }
    private String Encript(String text){
        String a="";
        char[] r;
        r=text.toCharArray();
        for(int i=0;i<r.length;i++){
            for(int j=0;j<26;j++){
                if(r[i]==alfa[j]){
                    a+=beta[j];
                    break;
                }
                else if(j==25)
                    a+=r[i];
            }
        }
        return a;
    }
    private void cifToBeta(String text){
        int aux[]=new int[26];
        boolean esta;
        int lel=cif.length();
        int te=0;
        for(int i=0;i<lel;i++){
            for(int j=0;j<text.length();j++){
                esta=true;
                for(int k=0;k<aux.length;k++){
                    if(text.codePointAt(text.length()-1-j)==aux[k]){
                        esta=false;
                    }
                }
                if(esta){
                    aux[i]=text.codePointAt(text.length()-1-j);
                    
                }    
            }
        }
        int t=0;
        for(int i=0;i<26;i++){
            if(aux[i]!=0){
                t++;
            }
        }
        te=cif.length()-t;
        System.out.println("|"+te+"|");
        for(int i=lel-te;i<26;i++){
            for(int k=122;k>96;k--){
                esta=true;
                for(int j=0;j<26;j++){
                    if(aux[j]==k){
                        esta=false;
                    }
                }
                if(esta){
                    aux[i]=k;
                }
            }
        }
        for(int i=0;i<26;i++){
            beta[i]=(char)aux[i];
        }
    }
    private String StringToBinE(String text){
        String a="";
        for(int i=0;i<text.length();i++){
            a+=(text.codePointAt(i)+15)+" ";
        }
        return a;
    }
    class Escucha implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem j =(JMenuItem) e.getSource();
            if (j==normal){
                System.out.println("Chat normal");
                N=true;
                E=false;
                P=false;
                crearNormal();
            }
            else if(j==encri){
                System.out.println("Chat encriptado");
                N=false;
                E=true;
                P=false;
                crearEncriptado();
            }
            else if(j==priva){
                System.out.println("Chat privado");
                N=false;
                E=false;
                P=true;
                crearPrivado();
            }
        }
    }
    class Listen implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b =(JButton) e.getSource();
            if (b==abrirN){
                System.out.println("abrir chat normal");
                actual="src/conver/Normal/"+String.valueOf(lstnorm.getSelectedValue());
                System.out.println(actual);
                N=true;
                E=false;
                P=false;
            }
            else if (b==abrirE){
                System.out.println("abrir chat encriptado");
                actual="src/conver/Encriptado/"+String.valueOf(lstencr.getSelectedValue());
                N=false;
                E=true;
                P=false;
            }
            else if (b==abrirP){
                System.out.println("abrir chat privado");
                cif=JOptionPane.showInputDialog(null, "Introduce la clave:");
                cifToBeta(cif);
                actual="src/conver/Privado/"+String.valueOf(lstpriv.getSelectedValue());
                N=false;
                E=false;
                P=true;
            }
            else if(b==enter){
                System.out.println("enviar");
                if(N)
                    escribirN();
                else if(E)
                    escribirE();
                else if(P)
                    escribirP();
            }
        }
    }
    public void crearNormal(){
        String na=JOptionPane.showInputDialog(null, "Introduce el nombre de la conversación:");
        try{
        FileWriter fwN=new FileWriter("src/conver/Normal/"+na+".txt");
        }catch(IOException e){}
        modnorm.addElement(na+".txt");
        actual="src/conver/Normal/"+na+".txt";
    }
    public void crearEncriptado(){
        String na=JOptionPane.showInputDialog(null, "Introduce el nombre de la conversación:");
        try{
        FileWriter fwE=new FileWriter("src/conver/Encriptado/"+na+".enc");
        }catch(IOException e){}
        modencr.addElement(na+".enc");
        actual="src/conver/Encriptado/"+na+".enc";
    }
    public void crearPrivado(){
        String na=JOptionPane.showInputDialog(null, "Introduce el nombre de la conversación:");
        cif=JOptionPane.showInputDialog(null, "Introduce la clave:");
        cifToBeta(cif);
        try{
        FileWriter fwP=new FileWriter("src/conver/Privado/"+na+".gpg");
        }catch(IOException e){}
        modpriv.addElement(na+".gpg");
        actual="src/conver/Privado/"+na+".gpg";
    }
    public void escribirN(){
        try{
            FileWriter fwN=new FileWriter(actual,true);
            fwN.write(name+":  "+write.getText()+"\n");
            fwN.flush();
        }catch(IOException e){}
        catch(NullPointerException ex){JOptionPane.showMessageDialog(null,"No eligió ningún chat Normal, por favor escoja uno");}
        finally{
            write.setText("");
        }
    }
    public void escribirE(){
        try{
            FileWriter fwE=new FileWriter(actual,true);
            fwE.write(Encriptar(name+":  "+write.getText()+"\n"));
            System.out.println(Encriptar(write.getText()));
            fwE.flush();
        }catch(IOException e){}
        catch(NullPointerException ex){JOptionPane.showMessageDialog(null,"No eligió ningún chat Encriptado, por favor escoja uno");}
        finally{
            write.setText("");
        }
    }
    public void escribirP(){
        try{
            FileWriter fwP=new FileWriter(actual,true);
            fwP.write(Encript(name+":  "+write.getText()+"\n"));
            System.out.println(Encript(name+":  "+write.getText()+"\n"));
            fwP.flush();
        }catch(IOException e){}
        catch(NullPointerException ex){JOptionPane.showMessageDialog(null,"No eligió ningún chat Privado, por favor escoja uno");}
        finally{
            write.setText("");
        }
    }
    public void revisarN(int e){
        int u=0;
        File f=new File("src/conver/Normal");
        File[] ficheros=f.listFiles();
        for(int x=0;x<ficheros.length;x++){
            u=0;
            for (int i=0;i<modnorm.getSize();i++){
                if(modnorm.getElementAt(i).equals(ficheros[x].getName())){
                    u++;
                    
                }
            }
            if(u==0)
            modnorm.addElement(ficheros[x].getName());
        }
    }
    public void revisarE(int e){
        int p=0;
        File f=new File("src/conver/Encriptado");
        File[] ficheros=f.listFiles();
        for(int x=0;x<ficheros.length;x++){
            p=0;
            for (int i=0;i<modencr.getSize();i++){
                if(modencr.getElementAt(i).equals(ficheros[x].getName())){
                    p++;
                }
            }
            if(p==0)
            modencr.addElement(ficheros[x].getName());
        }
    }
    public void revisarP(int e){
        int w=0;
        File f=new File("src/conver/Privado");
        File[] ficheros=f.listFiles();
        for(int x=0;x<ficheros.length;x++){
            w=0;
            for (int i=0;i<modpriv.getSize();i++){
                if(modpriv.getElementAt(i).equals(ficheros[x].getName())){
                    w++;
                }
            }
            if(w==0)
            modpriv.addElement(ficheros[x].getName());
        }
    }
}
