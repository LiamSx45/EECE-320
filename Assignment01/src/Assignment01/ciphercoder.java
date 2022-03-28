package Assignment01;

public class ciphercoder {

	private String message;
	private int shiftNumber;
	private int rotateNumber;
	private String cipher;

	public ciphercoder(String msg, int sNum, int rNum) {
		if (containsAlpha(msg)) {
			message = msg;
			if (sNum < 0 || sNum > 25) {
				System.out.println("Error!!! The shift should be between 0 and 25");
			} else {
				shiftNumber = sNum;
				if (rNum < 0) {
					System.out.println("Error!!! Rotation should be greater than or equal zero");
				} else {
					rotateNumber = rNum;
					if (shiftNumber == 0 && rotateNumber == 0) {
						System.out.println("Error!!! No Encryption Applied");
					} else {
						System.out.println(toString());
					}
				}
			}
		} else {
			System.out.println("Error!!! Atleast one letter should be provided");
		}
	}

	private boolean containsAlpha(String msg) {
		for (int i = 0; i < msg.length(); i++) {
			if ((msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z') || (msg.charAt(i) >= 'A' && msg.charAt(i) <= 'Z')) {
				return true;
			}
		}
		return false;
	}

	private String ceasarCipher() {
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < message.length(); i++) {
			if (Character.isUpperCase(message.charAt(i))) {
				char ch = (char) (((int) message.charAt(i) + shiftNumber - 65) % 26 + 65);
				result.append(ch);
			} else if (Character.isLowerCase(message.charAt(i))) {
				char ch = (char) (((int) message.charAt(i) + shiftNumber - 97) % 26 + 97);
				result.append(ch);
			} else {
				result.append(message.charAt(i));
			}
		}
		return result.toString();
	}

	private String rotateRight() {
		String ans = cipher.substring(cipher.length() - rotateNumber)
				+ cipher.substring(0, cipher.length() - rotateNumber);
		return ans;
	}

	public String toString() {
		cipher = ceasarCipher();
		cipher = rotateRight();
		return "Your cipher encoded message is " + cipher;
	}
}
