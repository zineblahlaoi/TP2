
public class Ecole {
	public static void main(String[] args) {
		doctorant doc=new doctorant();
		doc.setNom("lahlaoi");
		System.out.println("je suis le doctorant "+ doc.nom);
		System.out.println("le nombre de jours de vacances est "+doc.calculeVacances(21)+"jours");
		System.out.println("le salaire est "+doc.calculeSalaire(32)+"jours");
	}

}
