package evaluations;

public class Evaluation {
private String nom,prenom;
private int poids,age,rythme,vitesse;
public Evaluation() {
	super();
}
public Evaluation(String nom, String prenom, int age) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getPoids() {
	return poids;
}
public void setPoids(int poids) {
	this.poids = poids;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getRythme() {
	return rythme;
}
public void setRythme(int rythme) {
	this.rythme = rythme;
}
public int getVitesse() {
	return vitesse;
}
public void setVitesse(int vitesse) {
	this.vitesse = vitesse;
}
public String evalage()
{
if(this.age<14)
{
return this.nom+" "+this.prenom+"  jouera avec les cadets";	
}
else if(this.age<18)
	return this.nom+" "+this.prenom+"  jouera avec les juniors";
else
	return this.nom+" "+this.prenom+"  jouera avec les séniors";

}
public String evalpoids()
{
	if(this.poids<80)
		return "compatible";
	else 
		return "incompatible";

}
public String evalrythme()
{
	if((this.rythme>=61)&&(this.rythme<=73))
	return this.rythme+" est un bon rythme cardiaque";
	else
		return this.rythme+" est un mauvais rythme cardiaque";
	
}

public String evalvitesse()
{
	if(this.vitesse<30)
		return this.vitesse+" est une bonne vitesse ";
	else
		return this.vitesse+" est une vitesse inacceptable!";


}

}
