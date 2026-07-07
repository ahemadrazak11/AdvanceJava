<!DOCTYPE html>
<html>
<head>
<title>Portals</title>
<link rel="stylesheet" href="css/index.css">
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
								<a href=""><li>Home</li></a>
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
		<h1>Welcome To Our Portal</h1>
		<p>Select your portal to login and access your account<p>
	</div>

<!-- three cards -->
<div id="cards_container">

	<!-- first card -->
	<div class="cards">
		<article>
			<div  class="card_items" id="customer_card_image">
				<div class="card_images"><i class="fa-solid fa-users"></i></div>
				<div class="card_headings">Customer Portal</div>
				<div class="card_descriptions">Access your account, view service, track requests and manage your information.</div>
				<div><a href="Customer.jsp"><div class="card_buttons" id="customer_btn">Access Customer Portal <i class="fa-solid fa-arrow-right"></i></div></a></div>
			</div>
		</article>
	</div>
	<!-- second card -->
	<div class="cards">
		<article>
			<div class="card_items" id="employee_card_image">
				<div class="card_images"><i class="fa-solid fa-suitcase"></i></div>
				<div class="card_headings">Employee Portal</div>
				<div class="card_descriptions">Access internal resources, manage tasks, view schedules and stay updated with company news.</div>
				<div><a href="EmployeeLogin.jsp"><div class="card_buttons" id="employee_btn">Access Employee Portal <i class="fa-solid fa-arrow-right"></i></div></a></div>
			</div>
		</article>
	</div>
	<!-- third card -->
	<div class="cards">
		<article>
			<div class="card_items" id="admin_card_image">
				<div class="card_images"><i class="fa-solid fa-user-shield"></i></div>
				<div class="card_headings">Admin Portal</div>
				<div class="card_descriptions">Manage users, settings, reports and system configuration from the admin dashboard.</div>
				<div><a href=""><div class="card_buttons" id="admin_btn">Access Admin Portal <i class="fa-solid fa-arrow-right"></i></div></a></div>
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
