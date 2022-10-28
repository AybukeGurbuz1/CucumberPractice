Feature:

  Scenario: US06 Contact Us Form
    Given zey Lunch browser
    And zey Negate to 'automationExcercise'
    Then zey Verify that home page is visible successfully
    And zey Click on Contact Us button
    And zey Verify Get In Touch is visible
    And zey Enter name, email, subject and message
    And zey Upload file
    And zey Click Submit button
    And zey Click Ok button
    And zey Verify succes messsage Success Your details have been submitted succesfully is visible
    And zey Click Home button and verify that landed to home page successfull
    And zey Closed pages
