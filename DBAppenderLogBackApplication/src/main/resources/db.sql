DROP TABLE IF EXISTS `logback`.`logging_event`;
CREATE TABLE  `logback`.`logging_event` (
  `timestmp` bigint DEFAULT NULL,
  `formatted_message` text,
  `logger_name` varchar(50) DEFAULT NULL,
  `level_string` varchar(50) DEFAULT NULL,
  `reference_flag` smallint DEFAULT NULL,
  `caller_filename` varchar(50) DEFAULT NULL,
  `caller_class` varchar(50) DEFAULT NULL,
  `caller_method` varchar(50) DEFAULT NULL,
  `caller_line` char DEFAULT NULL,
   `event_id` int  DEFAULT NULL
);


DROP TABLE IF EXISTS `logback`.`logging_event_property`;
CREATE TABLE  `logback`.`logging_event_property` (
  `event_id` int DEFAULT NULL,
  `mapped_key` varchar(50) DEFAULT NULL,
  `mapped_value` text
) ;

DROP TABLE IF EXISTS `logback`.`logging_event_exception`;
CREATE TABLE  `logback`.`logging_event_exception` (
  `event_id` int DEFAULT NULL,
  `i` smallint DEFAULT NULL,
  `trace_line` varchar(50) DEFAULT NULL
) ;