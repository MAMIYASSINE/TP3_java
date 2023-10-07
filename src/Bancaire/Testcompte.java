package Bancaire;

public class Testcompte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne P1=new Personne("aa","bb","cc");
		Personne P2=new Personne("aa","zzz","ee");
		Compte []tab =new Compte[3];
		tab[0]=new Compte(P1,2500,800,1000);
		tab[1]=new Compte(P1,1000,800,1000);
		tab[2]=new Compte(P2,1500,800,1000);
		/*for(int i=0;i<3;i++)
		{
			System.out.println(tab[i]);
		}*/
		Compte.Virement(tab[0],tab[2], 3000);
		System.out.println(tab[0].getsolde());
		System.out.println(tab[2].getsolde());
		double max=tab[0].getsolde();
		int p=0;
		for(int i=1;i<tab.length;i++)
		{
			if(tab[i].getsolde()>max)
			{
				max=tab[i].getsolde();
				p=i;
			}
		}
		System.out.println(tab[p]);
		/*Compte C1=new Compte(P1,2500,800,1000);
		Compte C2=new Compte(P1,1000,800,1000);
		System.out.println(C1);
		System.out.println(C2);
		C1.crediter(500);
		System.out.println(C1.getsolde());
		C1.debiter(1000);
		System.out.println(C1.getsolde());
		System.out.println(C1.MontantDecouvert());
		C1.Virement(C2, 1000);
		System.out.println(C1.getsolde());
		System.out.println(C2.getsolde());*/
	}

}
