/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Biodata {
   public static void main(String[] args) {
        Bio b = new Bio();
   }
}
class Bio extends JFrame{
    	private String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
	private String months[] = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec" };
	private String years[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005",
			"2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
			"2020" };
   JLabel ljudul = new JLabel ("BUAT AKUN");
   JLabel lnama = new JLabel("Nama   ");
   JTextField tnama = new JTextField();
   JLabel username = new JLabel("Username  ");
   JTextField tusername = new JTextField();
   JLabel email = new JLabel("Email  ");
   JTextField temail = new JTextField();
   JLabel ltglahir = new JLabel("TTL :");
   JComboBox date = new JComboBox(dates);
   JComboBox month = new JComboBox(months);
   JComboBox year = new JComboBox(years);
   JLabel hobi = new JLabel("Hobi");
   JTextField thobi = new JTextField();
   JLabel gambar = new JLabel(new ImageIcon(getClass().getResource(("printaja.jpeg"))));
   JLabel agama = new JLabel("Agama");
   JLabel pekerjaan = new JLabel("Pekerjaan");
   String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha"};
   String[] namaPekerjaan = {"Mahasiswa","Pengusaha","Pedagang","guru","karyawan"};
   JComboBox cmbAgama = new JComboBox(namaAgama);
   JComboBox tpekerjaan = new JComboBox(namaPekerjaan);
   
   JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
   JRadioButton rbWanita = new JRadioButton(" Perempuan ");
   JLabel alamat = new JLabel ("Alamat");
   final JTextArea falamat = new JTextArea(20, 20);    
   JButton btnedit = new JButton ("Edit");
   JButton btnSave = new JButton("Save");
   
   

   public Bio() {
       setTitle("Biodata Diri");
	setDefaultCloseOperation(3);
	setSize(800,600);
        setLocation(500, 50);

	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);
        
        btnSave.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               HalamanDalam dalam = new HalamanDalam();
               dispose();
           }
       });

	setLayout(null);
        add(ljudul);
        add(gambar);
	add(lnama);
        add(tnama);
	add(ltglahir);
        add(date);
        add(month);
        add(year);
	add(rbPria);
	add(rbWanita);
	add(cmbAgama);
        add(alamat);
        add(falamat);
        add(btnedit);
	add(btnSave);
        add(agama);
        add(hobi);
        add(thobi);
        add(username);
        add(tusername);
        add(email);
        add(temail);
        add(pekerjaan);
        add(tpekerjaan);

        ljudul.setBounds(320,15,120,20);
        gambar.setBounds(400,50,350,200);
	lnama.setBounds(50,80,80,20);
        tnama.setBounds(120,80,210,20);
        username.setBounds(50,110,80,20);
        tusername.setBounds(120,110,210,20);
        email.setBounds(50,140,80,20);
        temail.setBounds(120,140,210,20);
        pekerjaan.setBounds(50,170,190,20);
        tpekerjaan.setBounds(120,170,210,20);
	ltglahir.setBounds(50,290,50,20);
        date.setBounds(120,290,50,20);
        month.setBounds(190,290,60,20);
        year.setBounds(270,290,70,20);
        agama.setBounds(50,320,190,20);
        cmbAgama.setBounds(120,320,220,20);
	rbPria.setBounds(120,230,100,20);
	rbWanita.setBounds(240,230,100,20);
        alamat.setBounds(50,350,120,20);
        falamat.setBounds(120,350,220,75);
        btnedit.setBounds(90,480,120,30);
	btnSave.setBounds(240,480,120,30);
	setVisible(true);
}
}
