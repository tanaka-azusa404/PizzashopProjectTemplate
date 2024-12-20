/**
 * クラス名：	KiddaLaController
 * 概要　　：	KIDDA-LA業務システムコントローラ
 * 作成者名：
 * 作成日　：
 * 修正者名：
 * 修正日　：
 */

package jp.ac.yic.kiddala.control;

import java.util.ArrayList;

import jp.ac.yic.kiddala.action.CustomerSearchDisplayAction;
import jp.ac.yic.kiddala.action.MainMenuDisplayAction;
import jp.ac.yic.kiddala.action.PrintOutAction;
import jp.ac.yic.kiddala.model.Customer;
import jp.ac.yic.kiddala.model.OrderDetail;
import jp.ac.yic.kiddala.view.DeliveryConfirmFrame;

public class KiddaLaController {

	public static void customerSearchDisplay() {
		CustomerSearchDisplayAction action = new CustomerSearchDisplayAction();
		action.execute();
	}

	public static void mainMenuDisplay() {
		MainMenuDisplayAction action = new MainMenuDisplayAction();
		action.execute();
	}

	public static Customer orderInputDisplay(String custId) throws Exception {
		Customer customer = new Customer(
								9999, "ダミー顧客", "ダミーコキャク", "99999999999", "東京都千代田区神田小川町9-9-9");
		return customer;
	}

	public static String[][] itemMenuDisplay() throws Exception {
		return null;
	}

	public static ArrayList<OrderDetail> deliveryConfirm(String custId)
			throws Exception {
		return null;
	}

	public static ArrayList<OrderDetail> orderRegister(
			ArrayList<OrderDetail> orderDetailList) throws Exception {
		return null;
	}

	public static int customerModify(Customer customer) throws Exception {
		return 0;
	}

	public static void printOut(DeliveryConfirmFrame frame) throws Exception {
		PrintOutAction action = new PrintOutAction();
		action.execute(frame);
	}

	public static int deliveryComplete(String custId) throws Exception {
		return 0;
	}
}
