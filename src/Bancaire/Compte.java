package Bancaire;
public class Compte {
	static int compteur;
	private int numcompte;
	private Personne titulaire;
	private double solde;
	private double decouvertmax;
	private double debitmax;
	Compte(Personne p)
	{
		this.titulaire=p;
		this.solde=0;
		this.decouvertmax=800;
		this.debitmax=1000;
		compteur++;
		numcompte=compteur;
	}
	Compte(Personne p, double solde,double decouvertmax, double debitmax)
	{
		this.titulaire=p;
		this.solde=solde;
		this.decouvertmax=decouvertmax;
		this.debitmax=debitmax;
		compteur++;
		numcompte=compteur;
	}
	int getnum()
	{
		return this.numcompte;
	}
	double getsolde()
	{
		return this.solde;
	}
	double getdecouvert()
	{
		return this.decouvertmax;
	}
	double getdebit()
	{
		return this.debitmax;
	}
	void setsolde(double s)
	{
		this.solde=s;
	}
	void setdecouvert(double decouvert)
	{
		this.decouvertmax=decouvert;
	}
	void setdebit(double debit)

	{
		this.debitmax=debit;
	}
	@Override
	public String toString()
	{
		return titulaire+"numero de compte: "+numcompte+" solde: "+solde+" decouvert max: "+decouvertmax+" debit max :"+debitmax;
	}
	public void crediter(double montant)
	{
		this.solde=this.solde+montant;
	}
	public void debiter(double montant)
	{
		double mresultant;
		mresultant=this.solde-montant;
		if(mresultant<decouvertmax)
		{
			System.out.println("erreur de debit");
		}
		else
		{
			solde=mresultant;
		}
	}
	public boolean retrait(double montant)
	{
		if(montant>debitmax)
		{
			return false;
		}
		else
		{
			this.debiter(montant);
			return true;
		}
	}
	public boolean estadeouvert()
	{
		if(0<=solde)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public double MontantDecouvert()
	{
		if(this.estadeouvert()==true)
		{
			return -(this.solde);
		}
		else
		{
			return 0;
		}
	}
	public void Virement(Compte C1, double montant)
	{
		if(this.retrait(montant)==true)
		{
			C1.crediter(montant);
		}
		else
		{
			System.out.println("impossible de virement");
		}
	}
	public static void Virement(Compte C1,Compte C2, double montant)
	{
		if(C1.retrait(montant)==true)
		{
			C2.crediter(montant);
		}
		else
		{
			System.out.println("impossible de virement");
		}
	}
	
}
