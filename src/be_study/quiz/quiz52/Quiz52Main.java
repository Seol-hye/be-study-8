package be_study.quiz.quiz52;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz52Main {

	public static void main(String[] args) {

		String jsonString = "{\"id\":1,\"name\":\"John Doe\",\"contacts\":[{\"type\":\"email\",\"value\":\"john.doe@example.com\"},{\"type\":\"phone\",\"value\":\"01023456789\"}],\"address\":{\"street\":\"123 Main Street\",\"city\":\"Seoul\",\"zipcode\":\"12345\"},\"orders\":[{\"orderId\":\"ORD-001\",\"date\":\"2024-07-09\",\"items\":[{\"id\":1,\"name\":\"Smartphone\",\"quantity\":2},{\"id\":2,\"name\":\"Laptop\",\"quantity\":1}]},{\"orderId\":\"ORD-002\",\"date\":\"2024-07-10\",\"items\":[{\"id\":3,\"name\":\"Headphones\",\"quantity\":1}]}]}";

		JSONParser jsonParser = new JSONParser();

		try {
			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonString);

			CustomerDTO customer = new CustomerDTO();

			customer.setId(((Number) jsonObj.get("id")).intValue());
			customer.setName(jsonObj.get("name").toString());

			JSONArray contacts = (JSONArray) jsonObj.get("contacts");

			List<ContactDTO> contactList = new ArrayList<>();

			for (int i=0; i<contacts.size(); i++) {

				JSONObject contactObj = (JSONObject) contacts.get(i);

				ContactDTO contact = new ContactDTO();

				contact.setType(contactObj.get("type").toString());
				contact.setValue(contactObj.get("value").toString());

				contactList.add(contact);
			}

			customer.setContacts(contactList);

			JSONObject addressObj = (JSONObject) jsonObj.get("address");

			AddressDTO address = new AddressDTO();

			address.setStreet(addressObj.get("street").toString());
			address.setCity(addressObj.get("city").toString());
			address.setZipcode(addressObj.get("zipcode").toString());

			customer.setAddress(address);

			JSONArray orders = (JSONArray) jsonObj.get("orders");

			List<OrderDTO> orderList = new ArrayList<>();

			for (int i=0; i<orders.size(); i++) {

				JSONObject orderObj = (JSONObject) orders.get(i);

				OrderDTO order = new OrderDTO();

				order.setOrderId(orderObj.get("orderId").toString());
				order.setDate(orderObj.get("date").toString());
				
				JSONArray items = (JSONArray) orderObj.get("items");
				
				List<ItemDTO> itemList = new ArrayList<>();

				for (int j = 0; j < items.size(); j++) {

				    JSONObject itemObj = (JSONObject) items.get(j);

				    ItemDTO item = new ItemDTO();

				    item.setId(((Number) itemObj.get("id")).intValue());
				    item.setName(itemObj.get("name").toString());
				    item.setQuantity(((Number) itemObj.get("quantity")).intValue());

				    itemList.add(item);
				}
				order.setItems(itemList);

				orderList.add(order);
				
			}
			
			customer.setOrders(orderList);
			
			System.out.println(customer);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
