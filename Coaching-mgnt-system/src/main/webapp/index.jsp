<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Coaching Management</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<!-- Navigation Bar -->
<header>
    <nav class="navbar">
        <div class="logo">CoachingPro</div>
        <ul class="nav-links">
            <li onmouseenter="showPopup('student-popup')" onmouseleave="hidePopup('student-popup')">
                <a href="#">Student</a>
                <div class="popup" id="student-popup">
                    <a href="Student/addStudent.html" onclick="performAction('student', 'add')"><button>Add</button></a>
                    <a href="Student/editStudent.html" onclick="performAction('student', 'edit')"><button>Edit</button></a>
                    <a href="Student/deleteStudent.html" onclick="performAction('student', 'delete')"><button>Delete</button></a>
                    <a href="Student/getById.html" onclick="performAction('student', 'get')"><button>Get</button></a>
                    <a href="Student/getAllStudent.html" onclick="performAction('student', 'getAll')"><button>Get All</button></a>
                </div>
            </li>
            <li onmouseenter="showPopup('teacher-popup')" onmouseleave="hidePopup('teacher-popup')">
                <a href="#">Teacher</a>
                <div class="popup" id="teacher-popup">
                    <a href="#" onclick="performAction('teacher', 'add')"><button>Add</button></a>
                    <a href="#" onclick="performAction('teacher', 'edit')"><button>Edit</button></a>
                    <a href="#" onclick="performAction('teacher', 'delete')"><button>Delete</button></a>
                    <a href="#" onclick="performAction('teacher', 'get')"><button>Get</button></a>
                    <a href="#" onclick="performAction('teacher', 'getAll')"><button>Get All</button></a>
                </div>
            </li>
            <li onmouseenter="showPopup('attendance-popup')" onmouseleave="hidePopup('attendance-popup')">
                <a href="#">Attendance</a>
                <div class="popup" id="attendance-popup">
                    <a href="#" onclick="performAction('attendance', 'add')"><button>Add</button></a>
                    <a href="#" onclick="performAction('attendance', 'edit')"><button>Edit</button></a>
                    <a href="#" onclick="performAction('attendance', 'delete')"><button>Delete</button></a>
                    <a href="#" onclick="performAction('attendance', 'get')"><button>Get</button></a>
                    <a href="#" onclick="performAction('attendance', 'getAll')"><button>Get All</button></a>
                </div>
            </li>
            <li onmouseenter="showPopup('courses-popup')" onmouseleave="hidePopup('courses-popup')">
                <a href="#">Courses</a>
                <div class="popup" id="courses-popup">
                    <a href="#" onclick="performAction('courses', 'add')"><button>Add</button></a>
                    <a href="#" onclick="performAction('courses', 'edit')"><button>Edit</button></a>
                    <a href="#" onclick="performAction('courses', 'delete')"><button>Delete</button></a>
                    <a href="#" onclick="performAction('courses', 'get')"><button>Get</button></a>
                    <a href="#" onclick="performAction('courses', 'getAll')"><button>Get All</button></a>
                </div>
            </li>
            <li onmouseenter="showPopup('Schedules-popup')" onmouseleave="hidePopup('Schedules-popup')">
                <a href="#">Schedules</a>
                <div class="popup" id="Schedules-popup">
                    <a href="#" onclick="performAction('Schedules', 'add')"><button>Add</button></a>
                    <a href="#" onclick="performAction('Schedules', 'edit')"><button>Edit</button></a>
                    <a href="#" onclick="performAction('Schedules', 'delete')"><button>Delete</button></a>
                    <a href="#" onclick="performAction('Schedules', 'get')"><button>Show</button></a>
                </div>
            </li>
        </ul>

        <!-- Search Bar -->
        <div class="search-bar">
            <input type="text" placeholder="Search..." id="search-input">
            <button onclick="searchAction()">Search</button>
        </div>
    </nav>
</header>

<section class="welcome">
    <h1>Welcome to CoachingPro</h1>
    <p>Manage students, teachers, courses, and more with ease.</p>
</section>

<!-- Services Section -->
<section id="services" class="services">
    <h2>Our Services</h2>
    <div class="service-cards">
        <div class="card">
            <h3>Online Courses</h3>
            <p>Access a variety of online courses tailored to your needs.</p>
        </div>
        <div class="card">
            <h3>Personal Mentorship</h3>
            <p>Get one-on-one guidance from experienced mentors.</p>
        </div>
        <div class="card">
            <h3>Exam Preparation</h3>
            <p>Comprehensive training for competitive exams.</p>
        </div>
    </div>
</section>

<footer>
    <p>&copy; 2024 CoachingPro by Ajay. All rights reserved.</p>
</footer>

<script>
    function showPopup(id) {
        const popup = document.getElementById(id);
        popup.classList.add('visible');
    }

    function hidePopup(id) {
        const popup = document.getElementById(id);
        popup.classList.remove('visible');
    }

    function searchAction() {
        const query = document.getElementById("search-input").value;
    }
</script>
</body>
</html>
