import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FirstGUI extends JFrame implements ActionListener {

	private Container c;
	private JLabel title;
	private JLabel name;
	private JTextField Fname;
	private JLabel Lname;
	private JTextField Laname;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp;
	private JLabel Oadd;
	private JTextField tOadd;
	private JLabel Tadd;
	private JTextField tTadd;
	private JLabel city;
	private JTextField tcity;
	private JLabel country;
	private JComboBox tcountry;
	private JCheckBox term;
	private JButton ok;
	private JButton cancel;

	private String tcountries[] = { "Myammar","Singapore", "Brunei",
	                             "Cambodia","Indonesia","Laos",
	                             "Thailand","Malaysia","Vietnam",
	                             "Philippines"
	                           };

	public FirstGUI()
	{
		setTitle("Application Form");
		setBounds(300, 90, 500, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Application Form");
		title.setSize(200, 30);
		title.setLocation(150, 30);
		c.add(title);

		name = new JLabel("First Name: ");
		name.setSize(100, 20);
		name.setLocation(100, 100);
		c.add(name);

		Fname = new JTextField();
		Fname.setSize(190, 20);
		Fname.setLocation(200, 100);
		c.add(Fname);

		Lname = new JLabel("Last Name: ");
		Lname.setSize(100, 20);
		Lname.setLocation(100, 120);
		c.add(Lname);

		Laname = new JTextField();
		Laname.setSize(190, 20);
		Laname.setLocation(200, 120);
		c.add(Laname);

		gender = new JLabel("Gender: ");
		gender.setSize(100, 20);
		gender.setLocation(100, 160);
		c.add(gender);

		male = new JRadioButton("Male");
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(200, 160);
		c.add(male);

		female = new JRadioButton("Female");
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(275, 160);
		c.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		Oadd = new JLabel("Address 1: ");
		Oadd.setSize(100, 20);
		Oadd.setLocation(100, 200);
		c.add(Oadd);

		tOadd = new JTextField();
		tOadd.setSize(190, 20);
		tOadd.setLocation(200, 200);
		c.add(tOadd);

		Tadd = new JLabel("Address 2: ");
		Tadd.setSize(100, 20);
		Tadd.setLocation(100, 220);
		c.add(Tadd);

		tTadd = new JTextField();
		tTadd.setSize(190, 20);
		tTadd.setLocation(200, 220);
		c.add(tTadd);

		city = new JLabel("City: ");
		city.setSize(100, 20);
		city.setLocation(100, 240);
		c.add(city);

		tcity = new JTextField();
		tcity.setSize(190, 20);
		tcity.setLocation(200, 240);
		c.add(tcity);

		country = new JLabel("Country: ");
		country.setSize(100, 20);
		country.setLocation(100, 260);
		c.add(country);

		tcountry = new JComboBox(tcountries);
		tcountry.setSize(100, 20);
		tcountry.setLocation(200, 260);
		c.add(tcountry);

		ok = new JButton("0K");
		ok.setSize(100, 20);
		ok.setLocation(150, 450);
		ok.addActionListener(this);
		c.add(ok);

		cancel = new JButton("Cancel");
		cancel.setSize(100, 20);
		cancel.setLocation(270, 450);
		cancel.addActionListener(this);
		c.add(cancel);

		setVisible(true);
	}


	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == ok) {
			if (term.isSelected()) {
				String data1;
				String data
					= "Name : "
					+ Fname.getText() + "\n"
					+ "Last Name : "
					+ Laname.getText()	+ "\n";

				 if (male.isSelected())
					data1 = "Gender : Male"
							+ "\n";
				else
					data1 = "Gender : Female"
							+ "\n";

				String data2 = "Address 1 : " + Oadd.getText() +
				"Address 2 : " + Tadd.getText();
			}

		}

		else if (e.getSource() == cancel) {
			String def = "";
			Fname.setText(def);
			Laname.setText(def);
			Oadd.setText(def);
			Tadd.setText(def);
			city.setText(def);
			//country.setSelectedIndex(def);
			term.setSelected(false);
		}
	}
}

class Forms {

	public static void main(String[] args) throws Exception
	{
		FirstGUI f = new FirstGUI();

	}
}
