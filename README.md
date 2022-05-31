# Chạy phầm mềm

B1: Chạy file sql để tạo Database trước khi chạy phần mềm (nên dùng MySQL)
B2: Mở project bằng NETBEAN
B3: Tại thư mục Connect, trong file ConnectDB.java sửa thông tin hình dấu 3 chấm trong các dòng lệnh:
	final String url="jdbc:mysql://localhost:3306/...?useSSL=false"; (thay bằng tên schemas lưu data)
        final String user="..."; (thành tên user MySQL của bạn)
        final String pass="..";	(thành password MySQL của bạn)
B4: Chạy Project
B5: Để đăng nhập bằng tài khoản chủ cửa hàng: Tên đăng nhập: admin | Mật khẩu: 123456
    Đăng nhập bằng tài khoản nhân viên: Tên đăng nhập | Mật khẩu: Tự đặt (Ví dụ: nhanvien1 | abc123)
