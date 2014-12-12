package rts.factory;

import rts.exception.ErrorDoctorWho;

public class FactoryOfAbstractFactoryRts {

	static private IAbstractFactoryRts times = null;

	private FactoryOfAbstractFactoryRts (){};


	static private IAbstractFactoryRts getInstance(Class<?> newTimes) throws ErrorDoctorWho
	{
		if(times == null)
			try {
				times =  (IAbstractFactoryRts) newTimes.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		if(!times.getClass().equals(newTimes))
			throw new ErrorDoctorWho(times.getClass().toString());

		return times;
	}

	static public  IAbstractFactoryRts getInstanceOfPast() throws ErrorDoctorWho
	{

		return getInstance(AbstractFactoryRtsOfPast.class )  ;
	}


	static public  IAbstractFactoryRts getInstanceOfFuture() throws ErrorDoctorWho
	{

		return getInstance(AbstractFactoryRtsOfFutur.class )  ;

	}


}
