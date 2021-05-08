import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) {
	BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
	customerManager.Save(new Customer(1,"zehra","alkan","152516",15));
	System.out.println();
	}

}
