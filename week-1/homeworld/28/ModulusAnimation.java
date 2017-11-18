public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<800; i++ )
		{
			if ( i % 8 == 0 ){
				System.out.print("NGOC.... \r");
			}
			else if (i % 8 == 1) {
				System.out.print(".NGOC... \r");
			}
			else if (i % 8 == 2) {
				System.out.print("..NGOC.. \r");
			}
			else if (i % 8 == 3) {
				System.out.print("...NGOC. \r");
			}
			else if (i % 8 == 4) {
				System.out.print("....NGOC \r");
			}
			else if (i % 8 == 5) {
				System.out.print("C....NGO \r");
			}
			else if (i % 8 == 6) {
				System.out.print("OC....NG \r");
			}
			else if (i % 8 == 7) {
				System.out.print("GOC....N \r");
			}

			Thread.sleep(50);
		}
		
	}
}