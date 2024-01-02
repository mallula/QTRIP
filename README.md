# QTrip Automation

## Table of Contents
- [Background](#background)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [UI Test Cases](#ui-test-cases)
  - [Test Case 1: User Registration and Login](#test-case-1-user-registration-and-login)
  - [Test Case 2: City Search](#test-case-2-city-search)
  - [Test Case 3: Adventure Booking and Cancellation](#test-case-3-adventure-booking-and-cancellation)
  - [Test Case 4: Booking History](#test-case-4-booking-history)
- [API Test Cases](#api-test-cases)
  - [Test Case 1: User Registration and Login](#test-case-1-user-registration-and-login-1)
  - [Test Case 2: City Search API](#test-case-2-city-search-api)
  - [Test Case 3: Reservation](#test-case-3-reservation)
  - [Test Case 4: New and Duplicate Registrations](#test-case-4-new-and-duplicate-registrations)
- [Integration with TestNG Framework](#integration-with-testng-framework)
- [Contributing](#contributing)
- [License](#license)

## Background
This project is designed for automated testing of QTrip, covering both UI and API test cases. It uses the TestNG framework for UI tests and RestAssured for API tests.

## Prerequisites
Before running the tests, make sure you have the following prerequisites:
- WebDriver for UI tests (ChromeDriver recommended)
- Postman for API tests
- RestAssured library
- TestNG framework
- Java SDK

## Installation
Follow these steps to set up and install the automation suite:
1. Clone the repository to your local machine.
2. Install WebDriver and configure the path.
3. Install Postman for manual API test execution.
4. Install RestAssured library and TestNG framework in your project.
5. Ensure the Java SDK is installed on your machine.

## UI Test Cases

### Test Case 1: User Registration and Login
**Steps:**
1. Navigate to the registration page.
2. Register a new user.
3. Log in using the registered user credentials.
4. Verify successful login.

**Expected Result:**
Registration and login should be successful without errors.

### Test Case 2: City Search
**Steps:**
1. Perform a search for a city.
2. Select a city from the search results.
3. Verify the selected city page.

**Expected Result:**
The selected city page should be displayed with relevant information.

### Test Case 3: Adventure Booking and Cancellation
**Steps:**
1. Search for and select an adventure.
2. Book the adventure.
3. Verify the booking details.
4. Cancel the booking.
5. Verify successful cancellation.

**Expected Result:**
Adventure booking and cancellation should occur without errors.

### Test Case 4: Booking History
**Steps:**
1. Navigate to the booking history page.
2. Verify the display of past reservations.

**Expected Result:**
Past reservations should be displayed correctly.
