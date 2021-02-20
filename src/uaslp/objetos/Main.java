package uaslp.objetos;

class Persona{
    private int edad;
    private String name;

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }



    public void cumplirAnois()
    {
        edad++;
    }

    public int getEdad()
    {
        return edad;
    }

}

public class Main {

    public static void main(String[] args) {
	    Persona panchito = new Persona();
	    Persona Luisa = new Persona();

	    panchito.setName("Jose");
	    Luisa.setName("Josefina");

	    panchito.cumplirAnois();
	    panchito.cumplirAnois();
	    panchito.cumplirAnois();
	    panchito.cumplirAnois();

	    Luisa.cumplirAnois();
	    Luisa.cumplirAnois();

	    System.out.println(panchito.getName() + " tiene " + panchito.getEdad() + " años ");

	    System.out.println(Luisa.getName() + " tiene " + Luisa.getEdad() + " años");

    }
}
