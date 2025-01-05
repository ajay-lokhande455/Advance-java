document.getElementById('fetch-form').addEventListener('submit', async (event) => {
    event.preventDefault();

    const studentId = document.getElementById('studentId').value;

    try {
        const response = await fetch(`http://localhost:8080/Coaching_mgnt_system_war/Student/student?studentId=${studentId}`, {
            method: 'GET',
            headers: { "Content-Type": "application/json" }
        });

        console.log(response)

        const student = await response.json();

        console.log(student)

        showDetails(student);
    } catch (error) {
        alert(error.message);
    }
});


function showDetails(student) {
    const detailsDiv = document.getElementById('studentDetails');

    const tableHTML = ` <section class="student-admission">
        <h2>Student Details</h2>
        <form id="admission-form" >
          <div class="form-group">
          <label for="full-name">Full Name:</label>
          <input type="text" id="full-name" name="fullName" placeholder="Enter your Full Name" value="${student.name}" required>
          </div>
          <div class="form-group">
            <label for="full-name">Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" value="${student.email}" required>
          </div>
          <div class="form-group">
            <label for="phone">Phone Number:</label>
            <input type="tel" id="phone" name="phone" placeholder="Enter your phone" value="${student.phone}" required>
          </div>
          <div class="form-group">
            <label for="dob">Date of Birth:</label>
            <input type="text" id="dob" name="dob" placeholder="Enter your DOB " value="${student.dob}" required>
          </div>
          <div class="form-group">
            <label for="gender">Gender :</label>
            <input type="text" id="gender" name="gender" value="${student.gender}" required>
          </div>
          <div class="form-group">
            <label for="course">Course:</label>
            <input type="text" id="course" name="course" value="${student.course}" required>
          </div>
          <div class="form-group">
            <label for="address">Address:</label>
            <textarea id="address" name="address" rows="4" placeholder="Enter your address"  required>"${student.address}"</textarea>
          </div>
          <button type="submit"  value="edit student" class="btn-submit">Edit Student</button>
          <button type="submit"  value="delete student" class="btn-submit">Delete Student</button>
        </form>
      </section>
</div>
      `;

    // Display the table
    detailsDiv.style.display = 'block';
    detailsDiv.innerHTML = tableHTML;
}

// Update Student Details in 'PUT' Method
document.getElementByIdClassName('studentDetails').addEventListener('submit', async (event) => {
    event.preventDefault();

    const studentId = document.getElementById('studentId').value;
    const student = {
        student_id: document.getElementById('studentId').value,
        name: document.getElementById('full-name').value,
        email: document.getElementById('email').value,
        phone: document.getElementById('phone').value,
        dob: document.getElementById('dob').value,
        gender: document.getElementById('gender').value,
        course: document.getElementById('course').value,
        address: document.getElementById('address').value,
    };

    try {
        const response = await fetch(`http://localhost:8080/Coaching_mgnt_system_war/Student/student?studentId=${studentId}`, {
            method: 'PUT',
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(student),
        });

        const result = await response.json();
        if (response.ok) {
            alert('Student updated successfully!');
        } else {
            alert(`Error: ${result.message}`);
        }
    } catch (error) {
        console.log(`Error: ${error.message}`);
    }
});


document.getElementById('studentDetails').addEventListener('submit', async (event) => {
    event.preventDefault();

    const studentId = document.getElementById('studentId').value;
    const student = {
        student_id: document.getElementById('studentId').value,
        name: document.getElementById('full-name').value,
        email: document.getElementById('email').value,
        phone: document.getElementById('phone').value,
        dob: document.getElementById('dob').value,
        gender: document.getElementById('gender').value,
        course: document.getElementById('course').value,
        address: document.getElementById('address').value,
    };

    try {
        const response = await fetch(`http://localhost:8080/Coaching_mgnt_system_war/Student/student?studentId=${studentId}`, {
            method: 'PUT',
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(student),
        });

        const result = await response.json();
        if (response.ok) {
            alert('Student updated successfully!');
        } else {
            alert(`Error: ${result.message}`);
        }
    } catch (error) {
        console.log(`Error: ${error.message}`);
    }
});


