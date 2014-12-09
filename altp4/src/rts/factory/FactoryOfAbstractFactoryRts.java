package rts.factory;

import rts.exception.ErrorDoctorWho;

public class FactoryOfAbstractFactoryRts {

	static private IAbstractFactoryRts past = null;

	static private IAbstractFactoryRts future = null;

	private FactoryOfAbstractFactoryRts (){};

	/*
	static private IAbstractFactoryRts getInstance(Class<?> newTimes) throws ErrorDoctorWho
	{
		if(future == null)
			try {
				future =  (IAbstractFactoryRts) newTimes.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		if(future.getClass().equals(newTimes))
			throw new ErrorDoctorWho(future.getClass().toString());

		return future;
	}//*/

	static public  IAbstractFactoryRts getInstanceOfPast() throws ErrorDoctorWho
	{

		//return getInstance(AbstractFactoryRtsOfPast.class )  ; /*

		if(future != null)
			throw new ErrorDoctorWho(future.getClass().toString());
		if(past == null)
			past = new AbstractFactoryRtsOfPast();
		return past;

		//*/
	}


	static public  IAbstractFactoryRts getInstanceOfFuture() throws ErrorDoctorWho
	{

		//return getInstance(AbstractFactoryRtsOfFutur.class )  ; /*

		if(past != null)
			throw new ErrorDoctorWho(future.getClass().toString());
		if(future == null)
			future = new AbstractFactoryRtsOfFutur();
		return future;

		//*/

	}


}
