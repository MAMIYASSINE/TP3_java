package Bancaire;

public class Personne {
	private String nom,prenom,adresse;
	String getnom()
	{
		return this.nom;
	}
	String getprenom()
	{
		return this.prenom;
	}
	String getadd()
	{
		return this.adresse;
	}
	Personne(String nom,String prenom ,String addresse)
	{
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=addresse;
	}
	@Override
	public String toString()
	{
		return "nom: "+nom+" prenom: "+prenom+" adresse: "+adresse +"\n" ;
	}

}
