package tareaTres;

public class Trabajador {
	private String NumTrabajador;
	private String Nombre;
	private String ApellidoP;
	private String ApellidoM;
	private double HorasEx;
	private double SueldoBase;
	private int AIngreso;
	private double HORAS_EX = 276.5;
	private int antiguedad;
	private double total;

	/*public static void main(String[] args) {
        Trabajador Trabajador = new Trabajador(22, "Miguel Angel", "Lopez", "Rodea", 6, 9495, 2018);
        System.out.println("Prueba");
        System.out.println(Trabajador.to_String());
        System.out.println();
        System.out.println("El sueldo calculado es de:");
        System.out.println(Trabajador.CalcularSueldo());
    }*/
	
	public Trabajador(String NT, String Nom, String Pat, String Mat, double HT, double Suel, int Ing) {
		// TODO Auto-generated constructor stub
		this.NumTrabajador = NT;
		this.Nombre = Nom;
		this.ApellidoP = Pat;
		this.ApellidoM = Mat;
		this.HorasEx = HT;
		this.SueldoBase = Suel;
		this.AIngreso = Ing;
	}

	public String getNumTrabajador() {
		return this.NumTrabajador;
	}

	public void setNumTrabajador(String NT) {
		this.NumTrabajador = NT;
	}

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nom) {
		this.Nombre = Nom;
	}

	public String getApellidoP() {
		return this.ApellidoP;
	}

	public void setApellidoP(String Pat) {
		this.ApellidoP = Pat;
	}

	public String getApellidoM() {
		return this.ApellidoM;
	}

	public void setApellidoM(String Mat) {
		this.ApellidoM = Mat;
	}

	public double getHorasEx() {
		return this.HorasEx;
	}

	public void setHorasEx(double HT) {
		this.HorasEx = HT;
	}

	public double getSueldoBase() {
		return this.SueldoBase;
	}

	public void setSueldoBase(double Suel) {
		this.SueldoBase = Suel;
	}

	public int getAIngreso() {
		return this.AIngreso;
	}

	public void setAIngreso(int Ing) {
		this.AIngreso = Ing;
	}

	public String to_String() {
		String estado = "";
		estado += NumTrabajador + ", ";
		estado += Nombre + ", ";
		estado += ApellidoP + ", ";
		estado += ApellidoM + ", ";
		estado += HorasEx + ", ";
		estado += SueldoBase + ", ";
		estado += AIngreso;
		return estado;
	}

	public double CalcularSueldo() {
		antiguedad = 2022 - this.AIngreso;
		total = this.SueldoBase + (this.SueldoBase * (antiguedad * 0.3)) + (this.HorasEx * HORAS_EX);
		return total;
	}	
}
