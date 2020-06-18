class GPS {

    SecretGPS dukesGPS = new SecretGPS();
    
	public String getCoordinates(String input) {
		String password = dukesGPS.giveCoordinates(input);
		return password;
	}
}
