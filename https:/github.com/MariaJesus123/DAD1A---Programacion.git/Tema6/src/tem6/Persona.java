package tem6;

public class Persona {
	
	private static int numPersona;
	
	private String nombre;
	private String apellido;
	private int edad;
	private char sexo;
	
	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.sexo = 0;
		
	}

	public Persona(String nombre, String apellido, int edad, char sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public static int getNumPersona() {
		return numPersona;
	}

	public static void setNumPersona(int numPersona) {
		Persona.numPersona = numPersona;
	}

	public static int contarNuevaPersona()
	{
		return numPersona++;
	}
	public static int restarNuevaPersona()
	{
		return numPersona--;
	}
	
}
