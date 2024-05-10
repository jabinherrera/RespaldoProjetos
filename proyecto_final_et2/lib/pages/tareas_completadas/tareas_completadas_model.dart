import '../../components/completed_task/completed_task_widget.dart';
import '/flutter_flow/flutter_flow_icon_button.dart';
import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_util.dart';
import '/flutter_flow/flutter_flow_widgets.dart';
import 'tareas_completadas_widget.dart' show TareasCompletadasWidget;
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';

class TareasCompletadasModel extends FlutterFlowModel<TareasCompletadasWidget> {
  ///  State fields for stateful widgets in this page.

  final unfocusNode = FocusNode();
  // State field(s) for TabBar widget.
  TabController? tabBarController;
  int get tabBarCurrentIndex =>
      tabBarController != null ? tabBarController!.index : 0;

  // Model for CompletedTask component.
  late CompletedTaskModel completedTaskModel1;
  // Model for CompletedTask component.
  late CompletedTaskModel completedTaskModel2;
  // Model for CompletedTask component.
  late CompletedTaskModel completedTaskModel3;

  /// Initialization and disposal methods.

  void initState(BuildContext context) {
    completedTaskModel1 = createModel(context, () => CompletedTaskModel());
    completedTaskModel2 = createModel(context, () => CompletedTaskModel());
    completedTaskModel3 = createModel(context, () => CompletedTaskModel());
  }

  void dispose() {
    unfocusNode.dispose();
    tabBarController?.dispose();
    completedTaskModel1.dispose();
    completedTaskModel2.dispose();
    completedTaskModel3.dispose();
  }

/// Action blocks are added here.

/// Additional helper methods are added here.
}
