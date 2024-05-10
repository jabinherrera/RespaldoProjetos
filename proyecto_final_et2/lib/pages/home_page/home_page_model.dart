import '../../components/task/task_widget.dart';
import '/flutter_flow/flutter_flow_icon_button.dart';
import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_util.dart';
import '/flutter_flow/flutter_flow_widgets.dart';
import 'home_page_widget.dart' show HomePageWidget;
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';

class HomePageModel extends FlutterFlowModel<HomePageWidget> {
  ///  State fields for stateful widgets in this page.

  final unfocusNode = FocusNode();
  // State field(s) for TabBar widget.
  TabController? tabBarController;
  int get tabBarCurrentIndex =>
      tabBarController != null ? tabBarController!.index : 0;

  // Model for Task component.
  late TaskModel taskModel1;
  // Model for Task component.
  late TaskModel taskModel2;
  // Model for Task component.
  late TaskModel taskModel3;
  // Model for Task2.
  late TaskModel task2Model;

  /// Initialization and disposal methods.

  void initState(BuildContext context) {
    taskModel1 = createModel(context, () => TaskModel());
    taskModel2 = createModel(context, () => TaskModel());
    taskModel3 = createModel(context, () => TaskModel());
    task2Model = createModel(context, () => TaskModel());
  }

  void dispose() {
    unfocusNode.dispose();
    tabBarController?.dispose();
    taskModel1.dispose();
    taskModel2.dispose();
    taskModel3.dispose();
    task2Model.dispose();
  }

/// Action blocks are added here.

/// Additional helper methods are added here.
}
