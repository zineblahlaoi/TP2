
public class doctorant extends Etudiant implements salarie {

	String SujetThese;
	String  professeurEncadrant;
	public doctorant() {
		super();
	}
	public String getSujetThese() {
		return SujetThese;
	}
	public void setSujetThese(String sujetThese) {
		SujetThese = sujetThese;
	}
	public String getProfesseurEncadrant() {
		return professeurEncadrant;
	}
	public void setProfesseurEncadrant(String professeurEncadrant) {
		this.professeurEncadrant = professeurEncadrant;
	}
	
 public float calculeVacances(int Nbrjours)
{int v;
v=Nbrjours/10;
return v;
}
public double calculeSalaire(int Nbrheurs) {
	int s;
	double salaire;
	if(Nbrheurs<=32)
	{s=Nbrheurs*400;
	 salaire=s-(s*0.34);
	 return salaire+5000;
	}
	else {
		s=Nbrheurs*600;
		salaire=s-(s*0.17);}
	return salaire+5000;}




}
