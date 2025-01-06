package day13;

public class DemandDraft {

	public static void main(String[] args) {
		

				int n = 99511, d;
				
				String dd = "";
				int p=0,first=0;
				while (n != 0) {
					d = n % 10;
					n = n / 10;
					p++;
					if(p==1) {
						dd = dd + convertToWord(d);
						first=d;
					}
					else if(p==2) {
						if(d==1) {
							dd = convertToOnes(first);
						}
						else{
							dd =  convertToTens(d)+" "+dd;
						}
							
					}
					else if(p==3) {
						dd =  convertToWord(d)+" hundred "+ dd ;
					}
					else if(p==4) {
						dd =  convertToWord(d)+" thousand "+ dd ;
					}
					else if(p==5) {
						dd =  convertToTens(d)+" "+ dd ;
					}
				}

				System.out.println(dd);

			}

			private static String convertToOnes(int d) {
				String[] data = {"","elevan", "twelve", "thirteen","fourteen","fifteen",
						"sixteen","seventeen","eighteen","ninteen"};

				return data[d];

			}

			private static String convertToTens(int d) {
				String[] data = {"","ten","twenty","thirty","fourty","fifty",
						"sixty","seventy","eighty","ninety"};

				return data[d];
			}

			private static String convertToWord(int d) {
				
				String[] data = {"zero","one","two","three","four",
						"five","six","seven","eight","nine"};

				return data[d];

						
			}

		
	}


