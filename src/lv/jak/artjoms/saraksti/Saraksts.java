package lv.jak.artjoms.saraksti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Saraksts {

	public static void main(String[] args) {
		
		Audzeknis audzeknis;
		List <Audzeknis> audzeknisList = new ArrayList<Audzeknis>();
		Scanner input = new Scanner(System.in);
		int darbiba;
		
		do {
			System.out.println("Audzekņu saraksts");
			System.out.println("1-Pievienot jaunu audzekni");
			System.out.println("2-Korīģet audzekņa datus");
			System.out.println("3-Dzēst audzekni");
			System.out.println("4-Izdzest visu sarakstu");
			System.out.println("5-Izvadīt sarakstu  ");
			System.out.println("0-Beigt barbu ");
			System.out.print("Izvelaties darbu :");
			darbiba = input.nextInt();
			switch (darbiba) {
			case 1:
				System.out.println("Jauna audzekņa pievienošana");
				System.out.print("Ievadiet  audzekņa vardu:");
				String vards = input.next();
				System.out.print("Ievadiet  audzekņa uzvardu:");
				String uzvards = input.next();
				System.out.print("Ievadiet  audzekņa kursu:");
				int kurs = input.nextInt();
			
				audzeknis = new Audzeknis(vards, uzvards, kurs);
				 
				audzeknisList.add(audzeknis);
				System.out.println();
				for (Audzeknis a : audzeknisList) {
					System.out.println("Vārds: "+a.getVards()
					+"Uzvārds: "+a.getUzvards()
					+"Kurs: "+a.getKurs());
				}
				System.out.println();	
				break;
			case 2:
				int idNr = 2;
				
				String jVards;
				String juzvards;
				System.out.println("Audzekņa labošana");
				audzeknisList.get(idNr).setVards(jVards);	
				audzeknisList.get(idNr).setUzvards(juzvards);
				audzeknisList.get(idNr).setKurs(2);
				System.out.println("Izvadiet objekta kārtas numuru");
				Audzeknis a = audzeknisList.get(idNr - 2);
				
				break;
			case 3:
				System.out.println("Audzekņa dzēšana:");
				audzeknisList.clear();
				break;
			case 4:
				System.out.println("Saraksta izvadīšana");
		
				break;
			case 5:
				System.out.println("Saraksta dzēšana");
				audzeknisList.removeAll(audzeknisList);
				
				break;
			case 0:
				System.out.println("Darbs beigts!");
				break;
	

			default:
				System.out.println("Kļūda! Nav tādas darbības!");
				break;
			}
			
		}while(darbiba !=0);
		
input.close();
	}

}
