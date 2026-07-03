<!DOCTYPE html>
<html>
<head>
<title>Customer Portals</title>
<link rel="stylesheet" href="css/Customer.css">
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
		<h1>Welcome To Our Customer Portal</h1>
		<p>Access your account, message your request and get the support you need.<p>
		<p>Please choose an option below to continue.</p>
	</div>

<!-- three cards -->
<div id="cards_container">

	<!-- first card -->
	<div class="cards">
		<article>
			<div  class="card_items" id="customer_card_image">
				<div class="card_images"><i class="fa-solid fa-arrow-right-to-bracket"></i></div>
				<div class="card_headings">Login</div>
				<div class="card_descriptions">Already have an account? Login to access your dashboard.</div>
				<div><a href="CustomerLogin.jsp"><div class="card_buttons" id="login_btn"><i class="fa-solid fa-user"></i> Login to Account</div></a></div>
			</div>
		</article>
	</div>
	<!-- second card -->
	<div class="cards">
		<article>
			<div class="card_items" id="employee_card_image">
				<div class="card_images"><i class="fa-solid fa-user-plus"></i></div>
				<div class="card_headings">Register</div>
				<div class="card_descriptions">New to our platform? Create an account to get started.</div>
				<div><a href="CustomerRegister.jsp"><div class="card_buttons" id="regiter_btn"><i class="fa-solid fa-user-plus"></i> Create New Account</div></a></div>
			</div>
		</article>
	</div>	
</div>
<%
HttpSession session1 = request.getSession();
String message = (String) session1.getAttribute("message");
%>

<% if(message != null){ %>

<div id="notify_container">
<b id="message"><%= message %></b>
</div>

<%
    // Remove the message after displaying it once
    session1.removeAttribute("message");
%>

<% } %>

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

<script>
setTimeout(function () {
    let msg = document.getElementById("message");

    if (msg != null) {
        msg.style.display = "none";
    }
}, 3000);   // 3000 ms = 3 seconds
</script>

</body>
</html>






