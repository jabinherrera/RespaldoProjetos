import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_toggle_icon.dart';
import '/flutter_flow/flutter_flow_util.dart';
import 'task_widget.dart' show TaskWidget;
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';

class TaskModel extends FlutterFlowModel<TaskWidget> {
  ///  Local state fields for this component.

  bool isCompletada = false;

  bool isFavorita = false;

  String taskTitle = 'Title';

  String? taskDescription = '';

  DateTime? taskDueDate;

  /// Initialization and disposal methods.

  void initState(BuildContext context) {}

  void dispose() {}

/// Action blocks are added here.

/// Additional helper methods are added here.
}
