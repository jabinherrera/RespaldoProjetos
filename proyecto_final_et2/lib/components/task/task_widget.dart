import '/flutter_flow/flutter_flow_theme.dart';
import '/flutter_flow/flutter_flow_toggle_icon.dart';
import '/flutter_flow/flutter_flow_util.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:provider/provider.dart';

import 'task_model.dart';
export 'task_model.dart';

class TaskWidget extends StatefulWidget {
  const TaskWidget({Key? key}) : super(key: key);

  @override
  _TaskWidgetState createState() => _TaskWidgetState();
}

class _TaskWidgetState extends State<TaskWidget> {
  late TaskModel _model;

  @override
  void setState(VoidCallback callback) {
    super.setState(callback);
    _model.onUpdate();
  }

  @override
  void initState() {
    super.initState();
    _model = createModel(context, () => TaskModel());
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
        context.pushNamed('DetalleTarea');
      },
      child: Container(
        width: 378,
        height: 98,
        decoration: BoxDecoration(
          color: FlutterFlowTheme.of(context).tertiary,
          borderRadius: BorderRadius.circular(10),
          border: Border.all(
            color: Color(0xFF8E8E8E),
            width: 1,
          ),
        ),
        child: Row(
          mainAxisSize: MainAxisSize.max,
          children: [
            Align(
              alignment: AlignmentDirectional(0.00, 0.00),
              child: Column(
                mainAxisSize: MainAxisSize.max,
                children: [
                  Align(
                    alignment: AlignmentDirectional(-1.00, 0.00),
                    child: ToggleIcon(
                      onPressed: () async {
                        setState(
                                () => _model.isCompletada = !_model.isCompletada);
                      },
                      value: _model.isCompletada,
                      onIcon: Icon(
                        Icons.check_circle,
                        color: FlutterFlowTheme.of(context).primary,
                        size: 25,
                      ),
                      offIcon: Icon(
                        Icons.circle_outlined,
                        color: FlutterFlowTheme.of(context).secondaryText,
                        size: 25,
                      ),
                    ),
                  ),
                ],
              ),
            ),
            Expanded(
              child: Align(
                alignment: AlignmentDirectional(0.00, 1.00),
                child: Padding(
                  padding: EdgeInsetsDirectional.fromSTEB(5, 0, 5, 0),
                  child: Column(
                    mainAxisSize: MainAxisSize.max,
                    children: [
                      Expanded(
                        child: Row(
                          mainAxisSize: MainAxisSize.max,
                          children: [
                            Flexible(
                              child: Text(
                                _model.taskTitle,
                                style: FlutterFlowTheme.of(context).titleLarge,
                              ),
                            ),
                          ],
                        ),
                      ),
                      Flexible(
                        child: Row(
                          mainAxisSize: MainAxisSize.max,
                          children: [
                            Text(
                              _model.taskDescription!,
                              style: FlutterFlowTheme.of(context).labelMedium,
                            ),
                          ],
                        ),
                      ),
                      Expanded(
                        child: Row(
                          mainAxisSize: MainAxisSize.max,
                          children: [
                            Text(
                              'Hello World',
                              style: FlutterFlowTheme.of(context).bodyMedium,
                            ),
                          ],
                        ),
                      ),
                    ].divide(SizedBox(height: 3)).addToEnd(SizedBox(height: 0)),
                  ),
                ),
              ),
            ),
            Align(
              alignment: AlignmentDirectional(1.00, 0.00),
              child: Column(
                mainAxisSize: MainAxisSize.max,
                children: [
                  Align(
                    alignment: AlignmentDirectional(1.00, 0.00),
                    child: ToggleIcon(
                      onPressed: () async {
                        setState(() => _model.isFavorita = !_model.isFavorita);
                      },
                      value: _model.isFavorita,
                      onIcon: Icon(
                        Icons.star_sharp,
                        color: FlutterFlowTheme.of(context).primary,
                        size: 25,
                      ),
                      offIcon: Icon(
                        Icons.star_border,
                        color: FlutterFlowTheme.of(context).secondaryText,
                        size: 25,
                      ),
                    ),
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
