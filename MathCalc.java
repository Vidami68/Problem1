
public class MathCalc
{
	public static void main(String[] args)
	{
		int earthDiameter = 7600;
		int sunDiameter = 865000;
		
		double earthVolume;
		double sunVolume;
		double ratio;
		
		double sphereVolumeCoefficent = (double)(4) / (double)(3);
		
		earthVolume = ( sphereVolumeCoefficent * (Math.PI) * ( Math.pow ( earthDiameter / 2 , 3 ) ) );
		sunVolume = ( sphereVolumeCoefficent * (Math.PI) * ( Math.pow ( sunDiameter / 2 , 3 ) ) );
		ratio = sunVolume / earthVolume;
		
		System.out.println("The volume of the Earth is " + Math.round(earthVolume) + "  cubic miles.");
		System.out.println("The volume of the Sun is " + Math.round(sunVolume) + "  cubic miles.");
		System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + Math.round(ratio) +"." );
		
		
	}

}
