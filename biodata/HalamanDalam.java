
package biodata;

import java.awt.*;
import javax.swing.*;

public class HalamanDalam extends JFrame{
    JLabel kalimat;
    JLabel foto;


public HalamanDalam(){
    kalimat = new JLabel ("Selamat Akun Berhasil di simpan");
    foto = new JLabel (new ImageIcon(getClass().getResource(("printaja.jpeg"))));

    setLayout(null);
        add(kalimat);
        add(foto);
        kalimat.setBounds(80,350,250,30);
        kalimat.setFont(new Font("Arial", Font.PLAIN, 15));
        kalimat.setForeground(Color.blue);
        
        foto.setBounds(20,50,350,200);
        setSize(400,600);
        setLocation(500, 50);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
