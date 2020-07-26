class Compute {
 double calculateCI(double Principal,double rate,double time)
 {
	 return (Principal*(Math.pow(1+rate/100,time)));
 }
  float CalculateSI(float principal,float rate,float time)
	{
		return (principal*rate*time)/100;
	}


}
