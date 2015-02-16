package fi.ni.ifc2x3;
import java.util.List;

import fi.ni.IfcList;
import fi.ni.ifc2x3.interfaces.IfcDateTimeSelect;

/*
 * IFC Java class
The MIT License (MIT)

Copyright (c) 2014 Jyrki Oraskari

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

public class IfcTimeSeriesSchedule extends IfcControl 
{
 // The property attributes
 List<IfcDateTimeSelect> applicableDates = new IfcList<IfcDateTimeSelect>();
 String timeSeriesScheduleType;
 IfcTimeSeries   timeSeries;


 // Getters and setters of properties

 public List<IfcDateTimeSelect> getApplicableDates() {
   return applicableDates;
 }
 public void setApplicableDates(IfcDateTimeSelect value){
   this.applicableDates.add(value);

 }

 public String getTimeSeriesScheduleType() {
   return timeSeriesScheduleType;
 }
 public void setTimeSeriesScheduleType(String value){
   this.timeSeriesScheduleType=value;

 }

 public IfcTimeSeries getTimeSeries() {
   return timeSeries;

 }
 public void setTimeSeries(IfcTimeSeries value){
   this.timeSeries=value;

 }

}