public class GetNumber {
		public static void main(String[] args) {
			
			System.out.println(getString("abcd12333.56789"));
			
			System.out.println(getString("abcd123"));

		}
		
		public static String getString(String str){
			String Number;
			Number = str.replaceAll("[a-z|A-Z]", "");
			if(Number.indexOf(".") == -1){
				Number = Number+".00";
			} else {
				if(Number.indexOf(".")== Number.length()-1){
					Number = Number+"00";
				} else if (Number.indexOf(".")== Number.length()-2){
					Number = Number+"0";
				} else {
					Number = Number.substring(0, Number.indexOf(".")+3);
				}
			}
			return Number;
		}

	}