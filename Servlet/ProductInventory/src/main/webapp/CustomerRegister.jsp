<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration</title>
<link rel="stylesheet" href="css/CustomerRegister.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.1/css/all.min.css" />
</head>
<body>

<div id="navogation_bar">
	<header>
		<div class="display_flex">
			<div id="logo">
				<i class="fa-solid fa-box"></i>
			</div>
			<div>
				<nav>
					<div>
						<ul>
							<div id="navbar_items">
								<a href="index.jsp"><li>Home</li></a>
								<a href=""><li>About</li></a>
								<a href=""><li>Contact</li></a>
							</div>
						</ul>
					</div>
				</nav>
			</div>
			<div id="help_center" title="help center">
				<i class="fa-solid fa-circle-info"></i>
			</div>
		</div>
	</header>
</div>

<main>

<section id="main_section">
	<div id="main_heading">
		<h1>Customer Registration</h1>
		<p>Create your account to access our services and manage your requests easily.<p>
	</div>

<!-- cards -->
<div id="cards_container">

	<!-- first card -->
	<div class="cards">
		<article>
			<div  class="card_items" id="customer_card_image">
				<div class="card_images"><i class="fa-solid fa-user"></i></div>
				<div class="card_headings">Register</div>
				<form action="customer">
					<div id="form_container">
					
						<div class="label_container">
							<label for="username">Customer ID</label>
						</div>
						<div class="input_container">
							<i class="fa-solid fa-id-badge"></i><input type="text" name="id" class="input_width" placeholder="Enter your customer id" minlength="3" maxlength="5" autofocus autocomplete required>
						</div>
						
						<div class="label_container">
							<label for="username">Name</label>
						</div>
						<div class="input_container">
							<i class="fa-solid fa-address-card"></i></i><input type="text" name="name" class="input_width" minlength="2" maxlength="15" placeholder="Enter your name" autocomplete required>
						</div>
						
						
						<div class="label_container">
							<label for="username">Mobile</label>
						</div>
						<div class="input_container">
							<i class="fa-solid fa-phone"></i><input type="text" name="mobile" class="input_width" minlength="10" maxlength="10" placeholder="Enter your mobile" autocomplete required>
						</div>
						
						
						<div class="label_container">
							<label for="username">Email</label>
						</div>
						<div class="input_container">
							<i class="fa-solid fa-at"></i><input type="text" name="email" class="input_width" placeholder="Enter your email" autocomplete required>
						</div>
						
						
						<div class="label_container">
							<label for="username">Username</label>
						</div>
						<div class="input_container">
							<i class="fa-solid fa-user"></i><input type="text" name="username" class="input_width" minlength="3" maxlength="10" placeholder="Enter your username" autocomplete required>
						</div>
						
						
						<div class="label_container">
							<label for="pass">Password</label>
						</div>
						<div class="input_container">
							<i class="fa-solid fa-lock"></i><input type="password" name="password" class="input_width" minlength="5" maxlength="10" placeholder="Enter your password" required><i class="fa-solid fa-eye-slash"></i>
						</div>
						
						
						<div class="checked_link_container">
							<span id="check_container"><input type="checkbox" name="remember" id="check"> 
								<label for="check">I agree to the <span><a href="#">Terms & conditions</a></span>
								</label>
							</span>
						</div>
						<div id="login_btn">
							<input type="submit" value="Register">
						</div>
					</div>
				</form>
				<div id="bottom_line">
							Already have an account? <a href="CustomerLogin.jsp">Login here</a>
				</div>
			</div>
		</article>
	</div>	
</div>
</section>
</main>
<footer>
<div id="footer_container">
	<p>
	<span id="left_footer_text"><i>&copy;</i>2026 Product Inventory. All rights reserved.</span> 
	<span id="right_footer_text">Design with <i>&hearts;</i> by Ahemad Raza Khan.</span>
	</p>
</div>
</footer>
</body>
</html>