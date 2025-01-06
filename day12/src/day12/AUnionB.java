package day12;

public class AUnionB {

	public static void main(String[] args) {
				int[] a = {1,2,3,4,5,6};
				int[] b = {100,200,1,2,4,300,400};
				int[] aub = new int[a.length+b.length];
				
				int index=0;
				for(int i=0;i<a.length;i++) {
					aub[index++] = a[i];
				}
				for(int i=0;i<b.length;i++) {
					if(checkDuplicate(aub,b[i])== false) {
						aub[index++] = b[i];	
					}
				}
				System.out.println("A array elements");
				for(int i=0;i<a.length;i++) {
					System.out.print(a[i]+" ");
				}
				System.out.println("\n B array elements");
				for(int i=0;i<b.length;i++) {
					System.out.print(b[i]+" ");
				}
				System.out.println("\n AUB array elements");
				
				for(int i=0;i<index;i++) {
					System.out.print(aub[i]+" ");
				}
			}

			private static boolean checkDuplicate(int[] aub, int bv) {
				
				for(int i=0;i<aub.length;i++) {
					if(aub[i] == bv) return true;
				}
				
				return false;
			}
}