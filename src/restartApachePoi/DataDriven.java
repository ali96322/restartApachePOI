package restartApachePoi;

public class DataDriven
{

	public static void main(String[] args)
	{
		String data = Util.getData("G:/selenium tool/restartApachePoi/src/testData/test.xlsx", "testdata", 2, 1);
		System.out.println(data);
	}

}
