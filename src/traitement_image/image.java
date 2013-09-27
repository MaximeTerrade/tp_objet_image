package traitement_image;

import java.io.*;

public class Image {
	
	int[][] pixels;
	int x;
	int y;
	
	public Image(String fichier) {
		
		int i=1;
		//lecture du fichier texte	
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null) {
				switch (i) {
					case 3:
						int[] tokens = ligne.split(" ");
						this.x = tokens[0];
						this.y = tokens[1];
						break;
	
					default:
						break;
				}
				
			}
			br.close(); 
			System.out.println(x);
			System.out.println(y);
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {
		Image i = new Image("C:\\Users\\max\\Desktop\\lena.pgm");
		
	}
	
}
