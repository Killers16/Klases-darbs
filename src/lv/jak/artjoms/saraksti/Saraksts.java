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
				System.out.println("Audzekņa labošana");
				if(audzeknisList.size()==0) {
					System.out.println("Audzeknu saraksts");
					System.out.println("----Nav ierakstu----");
				}
				else {
					for(int i=0;i<audzeknisList.size();i++) {
						System.out.println((i+1)+". Vards:"+audzeknisList.get(i).getVards()
								+"Uzvards:"+audzeknisList.get(i).getUzvards()
								+"Kurs:"+audzeknisList.get(i).getKurs());
					}
					System.out.println();
					System.out.println("Ievadit Audzek'na Nr.:");
					int kartasNr = input.nextInt();
					if((kartasNr-1)>=audzeknisList.size()||(kartasNr-1)<0){
						System.out.println("Ievadits nepareizs skaitlis!");
						
					}
					else {
						System.out.println("Jauna audzekņa pievienošana");
						System.out.print("Ievadiet  audzekņa vardu:");
						 vards = input.next();
						System.out.print("Ievadiet  audzekņa uzvardu:");
						 uzvards = input.next();
						System.out.print("Ievadiet  audzekņa kursu:");
						 kurs = input.nextInt();
						 audzeknisList.get(kartasNr-1).setVards(vards);
						 audzeknisList.get(kartasNr-1).setUzvards(uzvards);
						 audzeknisList.get(kartasNr-1).setKurs(kurs);;
					}
				}
				break;
			case 3:
				System.out.println("Audzekņa dzēšana:");
				System.out.println("Audzekņa labošana");
				if(audzeknisList.size()==0) {
					System.out.println("Audzeknu saraksts");
					System.out.println("----Nav ierakstu----");
				}
				else {
					for(int i=0;i<audzeknisList.size();i++) {
						System.out.println((i+1)+". Vards:"+audzeknisList.get(i).getVards()
								+"Uzvards:"+audzeknisList.get(i).getUzvards()
								+"Kurs:"+audzeknisList.get(i).getKurs());
					}
					System.out.println();
					System.out.println("Ievadit Audzekna Nr.:");
					int kartasNr = input.nextInt();
					audzeknisList.remove(kartasNr);
					
					System.out.println("Auzdeknu saraksts:");
					for (int i = 0; i < audzeknisList.size(); i++) {
						System.out.println((i+1)+". Vards:"+audzeknisList.get(i).getVards()
								+"Uzvards:"+audzeknisList.get(i).getUzvards()
								+"Kurs:"+audzeknisList.get(i).getKurs());
					}
						
					
				}
				
				break;
			case 4:
				System.out.println("Izdzest visu sarakstu");
				audzeknisList.removeAll(audzeknisList);
				//audzeknisList.clear();
				System.out.println("Saraksta ir dzēsts");
			
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
