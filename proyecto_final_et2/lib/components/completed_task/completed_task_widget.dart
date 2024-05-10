import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_util.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';

import 'completed_task_model.dart';
export 'completed_task_model.dart';

class CompletedTaskWidget extends StatefulWidget {
  const CompletedTaskWidget({Key? key}) : super(key: key);

  @override
  _CompletedTaskWidgetState createState() => _CompletedTaskWidgetState();
}

class _CompletedTaskWidgetState extends State<CompletedTaskWidget> {
  late CompletedTaskModel _model;

  @override
  void setState(VoidCallback callback) {
    super.setState(callback);
    _model.onUpdate();
  }

  @override
  void initState() {
    super.initState();
    _model = createModel(context, () => CompletedTaskModel());
  }

  @override
  void dispose() {
    _model.maybeDispose();

    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return InkWell(
      splashColor: Colors.transparent,
      focusColor: Colors.transparent,
      hoverColor: Colors.transparent,
      highlightColor: Colors.transparent,
      onTap: () async {
        context.pushNamed('DetalleTareaCompletada');
      },
      child: ListTile(
        title: Text(
          _model.taskTitle,
          style: FlutterFlowTheme.of(context).titleLarge,
        ),
        subtitle: Text(
          _model.taskDescription,
          style: FlutterFlowTheme.of(context).labelMedium,
        ),
        trailing: Icon(
          Icons.arrow_forward_ios,
          color: FlutterFlowTheme.of(context).secondaryText,
          size: 20,
        ),
        tileColor: FlutterFlowTheme.of(context).secondaryBackground,
        dense: false,
      ),
    );
  }
}
