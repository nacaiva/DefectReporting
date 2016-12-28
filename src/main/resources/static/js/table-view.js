$(function() {
  $.ajax({
    url : '/defect-reporting'
  }).done(function(defects) {
    var table = $('#defects');
    var valuesTemplate = table.find('#valuesTemplate').html();

    $.each(defects, function(index){
      var defect= defects[index];

      var versions='';
      $.each(defect.affectedVersions, function(index){
        versions+= ((versions != '' ?', ':'') + defect.affectedVersions[index].name);
      });

      table.append(valuesTemplate
          .replace('{{names}}',defect.name)
          .replace('{{severities}}',defect.severity.name)
          .replace('{{descriptions}}',defect.desription)
          .replace('{{dates}}',defect.creationDate)
          .replace('{{versions}}',versions)
          );
    });
    });
  });
