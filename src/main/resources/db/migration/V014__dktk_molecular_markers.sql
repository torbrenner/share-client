UPDATE samply.configuration SET setting='urn:adt:dataelement:77:1, urn:adt:dataelement:78:1, urn:adt:dataelement:89:1, urn:adt:dataelement:90:1, urn:adt:dataelement:91:1, urn:adt:dataelement:93:1, urn:marker:dataelement:1:1, urn:marker:dataelement:2:1, urn:marker:dataelement:3:1, urn:marker:dataelement:4:1' WHERE name='QUALITY_REPORT_ADDITIONAL_MDR_DATA_ELEMENTS';
UPDATE samply.configuration SET setting='urn:adt:dataelement:77:*;urn:adt:dataelement:78:*;urn:adt:dataelement:90:*;urn:adt:dataelement:93:*;urn:adt:dataelement:89:*;urn:adt:dataelement:91:*' WHERE name='INQUIRY_ADDITIONAL_MDRKEYS';
UPDATE samply.configuration SET setting='urn:dktk:dataelementgroup:7:latest;urn:dktk:dataelementgroup:8:latest;urn:adt:dataelementgroup:17:latest;urn:marker:dataelementgroup:1:latest' WHERE name='MDR_SOURCE_GROUPS';
UPDATE samply.configuration SET setting='dktk, adt, marker' WHERE name='QUALITY_REPORT_MDR_NAMESPACE';
UPDATE samply.configuration SET setting='urn:dktk:dataelementgroup:7:latest;urn:dktk:dataelementgroup:8:latest;urn:marker:dataelementgroup:1:latest' WHERE name='QUALITY_REPORT_MDR_GROUPS';
