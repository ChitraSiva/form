const axios = require('axios');
const create = 'student';
const apiUrl = 'http://localhost:8080/student';


const dataToStore = {
   
        name: "chitra",
        email: "chitrashiva430@gmail.com",
    gender: "female",
        school: "abc",
        sslcMark: 80,
        hscMark: 90,
        cutoff: 180,
        preferredDepartment: "MECH"
  };

axios.post(apiUrl, dataToStore, {
  headers: {
    'Authorization': `Bearer ${create}`
  }
})
.then(function (response) {
  // Handle the success response, if needed
})
.catch(function (error) {
  // Handle errors, if any
});


axios.get(apiUrl)
  .then(function (response) {
    // Handle the successful response here
    console.log(response.data);
  })
  .catch(function (error) {
    // Handle errors here
    console.error(error);
  });