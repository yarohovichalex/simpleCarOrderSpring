package by.htp.carparking.web.util;

public final class WebConstantDeclaration {
	
	//http://localhost:8083/carprking/MainServlet?action=order_car&user_id=1&car_id=1
	
	public static final String ACTION_NAME_VIEW_CAR_LIST = "view_car_list";
	public static final String ACTION_NAME_ORDER_CAR = "order_car";
	public static final String ACTION_NAME_RETURN_CAR = "return_car";
	
	public static final String PAGE_USER_MAIN = "/WEB-INF/page/user/main.jsp";
	
	public static final String REQUEST_PARAM_ACTION = "action";
	public static final String REQUEST_PARAM_CAR_LIST = "carlist";
	
	public static final String REQUEST_PARAM_USER_ID = "user_id";
	public static final String REQUEST_PARAM_CAR_ID = "car_id";
	
	public static final String REQUEST_MSG_SUCCESS = "msg_success";
	
	private WebConstantDeclaration(){	
	}
	
}
