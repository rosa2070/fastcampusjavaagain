package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderId = "201907210001";
		order.customerId = "abc123";
		order.orderDate = "2019�� 7�� 21��";
		order.customerName = "ȫ���";
		order.productId = "PD0345-12";
		order.shippingAddress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order.orderId);
		System.out.println("�ֹ��� ���̵� : " + order.customerId);
		System.out.println("�ֹ� ��¥ : " + order.orderDate);
		System.out.println("�ֹ��� �̸�: " + order.customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.productId);
		System.out.println("��� �ּ� : " + order.shippingAddress);

	}

}
