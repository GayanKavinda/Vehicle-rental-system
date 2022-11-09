Install MySQL Server and Workbench softwares
set username to mysql as "root" (default username)
set password to mysql as "sliitpc16$97"

create database - "payments"
create database - "vehicle"

import  payments_payment_details.sql  ,  vehicle_vehicle_availability.sql  ,  vehicle_vehicle_details.sql   to database

open project on netbeans

To add images of vehicles - go to "\OOP\web\asset\Images\vehicle_images" and save images.
use the following rename algorithm,

   0_<vehicle id>_<image no>.jpg      

   Example:- 0_2_1.jpg


Search pane in home page is a customized search engine for vehicle search.
Use pickup date as : 1st of  Jan 2019 and choose a category to test the system.