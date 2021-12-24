package sample;

public class AddOperator extends CalcOperator{
	/**
	 * 加算をおこなう
	 * 
	 * @param value1 {@inhericitDoc} (被加算値)
	 * @param value2 {@inhericitDoc} (加算値)
	 * @return {@inhericitDoc}
	 */
	@Override
	public int calculate(int value1, int value2) {
		return value1 + value2;
	}

}
