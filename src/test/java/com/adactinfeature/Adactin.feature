Feature: Hotel Booking In Adactin Application
 
@LoginPage1
Scenario: User launch The Application
Given User Launch The Adactin Application
When User Enter The Username In Username Field
Then User Enter The Password In Password Field
And User Click On The Login Button And Its Navigate To Search Hotel Page

#LoginPage2
#Scenario Outline:User launch The Application
#Given User Launch The Adactin Application
#When User Enter The "<Username>" In Username Field
#Then User Enter The "<Password>" In Password Field
#And User Click On The Login Button And Its Navigate To Search Hotel Page
#
#Examples: 
#     |Username      | Password  |
#     |David7358     |David@7358 |
#     |mohammedfazil |fazil12345 |
     
@SearchHotel
Scenario: User Select Hotel From Search Hotel Page
When User Select The Location In Location Field
Then User Select The Hotel In Hotels Field
Then User Select The Room Type In Room Type Field
Then User Select The Room Count In Number Of Rooms Field
Then User Select The Date In Check In Date Field
Then User Select The Date In Check Out Date Field
Then User Select The Adult Count In Adults per Room Field
Then User Select The Child Count In Childrens per Room Field
Then User Click the Search Button And Its Navigate To Select Hotel Page

@SelectHotelPage
Scenario: User Select The Hotel In Select Hotel Page
When User Click The Select Hotel Button
And User Click The Continue Button And Its Navigate To Book A Hotel Page

@BookHotelPage
Scenario: User Book The Hotel In Book A Hotel Page
When User Enter The First Name In First Name Field
Then User Enter The Last Name In Last Name Field
Then User Enter The Address In Billing Address Field
Then User Enter The Credit Card No In Credit Card No Field
Then User Select The Credit Card Type In Credit Card Type Field
Then User Select The Credit Card Expiry Month In Expiry Date Field
Then User Select The Credit Card Expiry Year In Expiry Date Field
Then User Enter The Cvv Number In CVV Number Field
Then User Click The Book Now Button And Its Navigate To Booking Confirmation Page
And User Click The My Ltinerary Button For Check The Booking Hotel









