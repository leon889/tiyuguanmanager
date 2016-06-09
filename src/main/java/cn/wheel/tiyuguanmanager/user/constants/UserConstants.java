package cn.wheel.tiyuguanmanager.user.constants;

public class UserConstants {
	/**
	 * ��ҳ�У�ÿһҳ��Ŀ������
	 */
	public static final int ITEM_PER_PAGE = 5;

	/**
	 * ��ҳ����ǰ��ƫ��ҳ��
	 */
	public static final int NAVI_PAGE_OFFSET = 3;

	/**
	 * ���ڱ�ʾͨѶ¼�������
	 * 
	 * @author DENG YURONG
	 * 
	 */
	public static final class ContratType {
		/**
		 * �ֻ�����
		 */
		public static final int TYPE_MOBILE = 1;

		/**
		 * ͨ�ŵ�ַ
		 */
		public static final int TYPE_ADDRESS = 2;

		/**
		 * �����ʼ�
		 */
		public static final int TYPE_EMAIL = 3;
	}

	/**
	 * ֤������
	 * 
	 * @author DENG YURONG
	 * 
	 */
	public static final class IdentifierType {
		/**
		 * ��������֤����
		 */
		public static final int TYPE_CITIZEN_ID = 1;

		/**
		 * ����
		 */
		public static final int TYPE_PASSPORT = 2;

		/**
		 * ����֤
		 */
		public static final int TYPE_ARMY = 3;
	}

	/**
	 * �Ա�
	 * 
	 * @author DENG YURONG
	 * 
	 */
	public static final class Gender {
		/**
		 * Ů
		 */
		public static final int GENDER_FEMALE = 0;

		/**
		 * ��
		 */
		public static final int GENDER_MALE = 1;
	}

	/**
	 * ajax ������ json �Ľ������
	 * 
	 * @author DENG YURONG
	 * 
	 */
	public static final class AjaxReturnValue {
		/**
		 * ��ǰ������Ҫ��¼
		 */
		public static final int NOT_LOGIN = 1;

		/**
		 * ��ǰ��¼�û�û��ָ����Ȩ��
		 */
		public static final int PERMISSION_DENIED = 2;

		/**
		 * ��Ϊ�û�������������µĵ�¼ʧ�ܰ�
		 */
		public static final int LOGIN_FAILED_DUE_TO_INFO_ERROR = 3;

		/**
		 * �û���Ϊ��
		 */
		public static final int LOGIN_EMPTY_USERNAME = 4;

		/**
		 * ����Ϊ��
		 */
		public static final int LOGIN_EMPTY_PASSWORD = 5;

		/**
		 * ��¼�ɹ�
		 */
		public static final int LOGIN_SUCCESS = 6;

		/**
		 * ע���ɹ�
		 */
		public static final int LOGOUT_SUCCESS = 7;

		/**
		 * ��������
		 */
		public static final int FORM_EXCEPTION = 8;

		/**
		 * �û��Ѿ�����
		 */
		public static final int USER_EXIST = 9;

		/**
		 * ע��ɹ�
		 */
		public static final int REGISTER_SUCCESS = 10;

		/**
		 * ��ʾ��ǰ��¼���û����ڽ���״̬
		 */
		public static final int USER_FORBIDDEN = 11;

		/**
		 * ��ʾҪ�����������ɫ�Ѿ���ϵͳ�д���ͬ����ɫ
		 */
		public static final int ROLE_EXIST = 12;

		/**
		 * ��ʾ�ɹ�����һ����ɫ
		 */
		public static final int ROLE_CREATE_SUCCESS = 13;

		/**
		 * ��ʾҪɾ���Ľ�ɫ����Ȼ�����û�������ֱ��ɾ��
		 */
		public static final int ROLE_IS_IN_USE = 14;

		/**
		 * ��Ч�Ľ�ɫ���
		 */
		public static final int ROLE_INVAILD_ROLE_ID = 15;

		/**
		 * ��ʾ�޷��ҵ�ָ���Ľ�ɫ
		 */
		public static final int ROLE_NOT_FOUND = 15;

		/**
		 * ��ʾҪɾ���Ľ�ɫ����ϵͳ������ɫ�����ܽ���ɾ������
		 */
		public static final int ROLE_PRESERVED = 16;

		/**
		 * �ɹ�ɾ����ɫ
		 */
		public static final int ROLE_DELETE_SUCCESS = 17;

		/**
		 * �ɹ��޸Ľ�ɫ��Ϣ
		 */
		public static final int ROLE_UPDATE_SUCCESS = 18;

		/**
		 * �ɹ������û�
		 */
		public static final int USER_INSERT_SUCCESS = 19;

		/**
		 * ��ʾҪ���в������û���������
		 */
		public static final int USER_NOT_EXIST = 20;

		/**
		 * ��ʾ�ɹ�����ָ�����û��˻�
		 */
		public static final int USER_ENABLE_SUCCESS = 21;

		/**
		 * ��ʾ�ɹ�����ָ�����û��˻�
		 */
		public static final int USER_FORBID_SUCCESS = 22;

		/**
		 * ��ʾ�ɹ�����û���Ϣ
		 */
		public static final int USER_UPDATE_SUCCESS = 23;

		/**
		 * ��ʾ�û���Ϣ��֤�ɹ�
		 */
		public static final int USER_VERIFY_SUCCESS = 24;

		/**
		 * ��ʾ�����û���֤�ɹ�
		 */
		public static final int USER_VERIFY_CANCEL_SUCCESS = 25;
	}

	/**
	 * ��ʾ�û�״̬
	 * 
	 * @author DENG YURONG
	 * 
	 */
	public static final class UserStatus {
		/**
		 * ����״̬
		 */
		public static final int NORMAL = 0;

		/**
		 * ��ʾ��ǰ�˺��Ѿ�������
		 */
		public static final int DISABLED = 1;
	}

	public static final class UserType {
		/**
		 * ��ʾ���˺�����ѧ���˺�
		 */
		public static final int TYPE_STUDENT = 0;

		/**
		 * ��ʾ���˺��������ݹ�����Ա���˺�
		 */
		public static final int TYPE_EMPLOYEE = 1;

		/**
		 * ��ʾ���˺�����ʦ�˺�
		 */
		public static final int TYPE_TEACHER = 2;
	}
}